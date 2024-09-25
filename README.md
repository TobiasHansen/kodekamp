# README

## Kjøre opp ngrok
```bash
 docker run -it -e NGROK_AUTHTOKEN=$NGROK_AUTH_TOKEN ngrok/ngrok:latest http host.docker.internal:8080
```

## Hot-reloading
```bash
./gradlew -t build -x test -i
```