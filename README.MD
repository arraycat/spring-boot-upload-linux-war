# spring-boot-upload-linux-war
来源：https://spring.io/guides/gs/uploading-files/  
上传路径在.../storage/StorageProperties.java中修改，需要注意权限问题  
以war包部署时，application.properties中的端口、上下文无效

使用jar方式运行为佳：nohup java -jar uploadfile-0.0.1-SNAPSHOT.jar &

再使用Nginx反代：
location /upload {  
                proxy_pass http://127.0.0.1:8888;
                proxy_set_header Host $host:$server_port;
                proxy_set_header X-Real-IP $remote_addr;
                proxy_set_header X-Forwarded-For $proxy_add_x_forwarded_for;
         }

