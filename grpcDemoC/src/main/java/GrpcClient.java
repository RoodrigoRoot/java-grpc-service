


import com.rod.grpc.userGrpc;
import com.rod.grpc.User.Empty;
import com.rod.grpc.User.UserInfo;
import com.rod.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9090).usePlaintext().build();
		
		// stubs - generate from proto
		
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		Empty emptyrequest = Empty.newBuilder().build();
		UserInfo response =  userStub.getUser(emptyrequest);
		System.out.println(response);
		
		
	}

}