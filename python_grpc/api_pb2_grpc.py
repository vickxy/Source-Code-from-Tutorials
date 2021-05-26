# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

import api_pb2 as api__pb2


class ApiStub(object):
    """Missing associated documentation comment in .proto file"""

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.ApiEndpoint = channel.unary_unary(
                '/satnux.grpc.api.Api/ApiEndpoint',
                request_serializer=api__pb2.ApiRequest.SerializeToString,
                response_deserializer=api__pb2.ApiResponse.FromString,
                )


class ApiServicer(object):
    """Missing associated documentation comment in .proto file"""

    def ApiEndpoint(self, request, context):
        """Missing associated documentation comment in .proto file"""
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_ApiServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'ApiEndpoint': grpc.unary_unary_rpc_method_handler(
                    servicer.ApiEndpoint,
                    request_deserializer=api__pb2.ApiRequest.FromString,
                    response_serializer=api__pb2.ApiResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'satnux.grpc.api.Api', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Api(object):
    """Missing associated documentation comment in .proto file"""

    @staticmethod
    def ApiEndpoint(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/satnux.grpc.api.Api/ApiEndpoint',
            api__pb2.ApiRequest.SerializeToString,
            api__pb2.ApiResponse.FromString,
            options, channel_credentials,
            call_credentials, compression, wait_for_ready, timeout, metadata)
