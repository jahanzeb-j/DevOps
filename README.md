# DevOps

````
██████╗ ███████╗██╗   ██╗ ██████╗  ██████╗ ███████╗
██╔══██╗██╔════╝██║   ██║ ██╔═══██╗██╔══██╗██╔════╝
██║  ██║█████╗  ██║   ██║ ██║   ██║██████╔╝███████╗
██║  ██║██╔══╝  ╚██╗ ██╔╝ ██║   ██║██╔═══╝ ╚════██║
██████╔╝███████╗ ╚████╔╝  ╚██████╔╝██║     ███████║
╚═════╝ ╚══════╝  ╚═══╝    ╚═════╝ ╚═╝     ╚══════╝
`````
DevOps Practice

- Jenkins [✔]
- Docker [✔]
- Swagger [✔]
- Docker Compose [✔]
- Auto Deploy [✔]
- Testing [x]

### Run Docker Compose
```
docker compose up
```

#### Stop Containers
```
docker compose down
```

### Build docker image
```
 docker build -t="devops-image" .
```
### Run Image
```
docker run -p 9090:9090 -t -d devops-image
```
```
docker ps
```
### Jenkins Pipeline 
[JenkinsFile](https://github.com/jahanzeb-j/DevOps/blob/dev/Jenkinsfile)
