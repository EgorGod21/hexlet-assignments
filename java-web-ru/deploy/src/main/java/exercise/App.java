package exercise;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import exercise.servlet.WelcomeServlet;
import exercise.servlet.CompaniesServlet;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

public class App {

    private static int getPort() {
        String port = System.getenv("PORT");
        if (port != null) {
            return Integer.valueOf(port);
        }
        return 5000;
    }

    public static Tomcat getApp(int port) {
        Tomcat app = new Tomcat();

        app.setBaseDir(System.getProperty("java.io.tmpdir"));
        app.setPort(port);

        Context ctx = app.addContext("", new File(".").getAbsolutePath());

        app.addServlet(ctx, WelcomeServlet.class.getSimpleName(), new WelcomeServlet());
        ctx.addServletMappingDecoded("", WelcomeServlet.class.getSimpleName());

        // BEGIN
        app.addServlet(ctx,CompaniesServlet.class.getSimpleName(),new CompaniesServlet());
        ctx.addServletMappingDecoded("/companies", CompaniesServlet.class.getSimpleName());
        // END

        return app;
    }

    public static void main(String[] args) throws LifecycleException, IOException, ParseException {
        Tomcat app = getApp(getPort());
        app.start();

        HttpGet request = new HttpGet("http://localhost:5000/companies?search=ol");
        CloseableHttpResponse response = HttpClients.createDefault().execute(request);

        HttpEntity entity = response.getEntity();
        String content = EntityUtils.toString(entity);
        content.replaceAll("\s",":");
        System.out.print(content.trim());

        app.stop();

    }
}
