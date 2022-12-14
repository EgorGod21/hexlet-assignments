FROM gradle:7.4.0-jdk17

WORKDIR /submit java-web-ru/deploy

COPY /deploy .

RUN gradle installDist

CMD ./build/install/deploy/bin/deploy