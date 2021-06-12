# DevOps
DevOps Practice

- Jenkins [Added]
- Docker [Added]
- Auto Deploy [x]
- Testing [x]

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
