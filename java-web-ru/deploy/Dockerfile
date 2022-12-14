FROM gradle:7.4.0-jdk17

WORKDIR /submit java-web-ru/servlet

COPY /app .

RUN gradle installDist

CMD ./build/install/servlet/bin/servlet