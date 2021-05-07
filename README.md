# java-grpc-service
## This repository is a example of Java with gRPC.

## Java with gRPC

### Installation

`git clone https://github.com/RoodrigoRoot/java-grpc-service.git `

`cd Java/grpcDemoR`

Now we have a create the container.

`docker build  -t java-grpc .`

### To run Server:

`docker run -p 9090:9090 java-grpc -d`

### Stress Test:
We need install ghz

And now we have to execute the next:

`ghz  -c 1000 -n 10000 --insecure  --proto src/main/resources/user.proto  --call java.user.get  localhost:9090`


## Armeria

To enter to folder Arm

`cd Arm`

Create a container:

`docker build  -t armeria-grpc .`

Run container:
`docker run -p 9091:9091 armeria-grpc .`

### Stress Test
`ghz  -c 1000 -n 10000 --insecure  --proto src/main/resources/user.proto  --call java.user.get  localhost:9091`

