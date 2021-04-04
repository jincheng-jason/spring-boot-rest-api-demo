# spring-boot-rest-api-demo

## Environment
- Java: 1.8
- Node: v14.15.3
- yarn: 1.22.10

## Step to run:

- For Docker:
```shell
docker build -t demo .
docker run -d -p 8080:8080 --name demo demo
```

- For MacOS or Linux: 
```shell
chmod 777 run.sh
./run.sh
```

- For Windows <br/>
Run the run.bat, the bat script didn't been tested, if doesn't work please execute commands inside seperately
  
Then visit http://localhost:8080/ in browser, it would display the Posts table, click any row to see its comments, and click comments line can go back to Posts page.