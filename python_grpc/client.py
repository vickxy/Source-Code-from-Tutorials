import grpc
import api_pb2
import api_pb2_grpc

def main():
    channel = grpc.insecure_channel('localhost:7073')
    stub = api_pb2_grpc.ApiStub(channel)
    response = stub.ApiEndpoint(api_pb2.ApiRequest(userName="Vikesh"))
    print(response)

if __name__ == "__main__":
    main()