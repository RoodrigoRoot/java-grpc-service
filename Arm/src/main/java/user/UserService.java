package user;

import com.rod.grpc.User.Empty;
import com.rod.grpc.User.UserInfo;
import com.rod.grpc.userGrpc.userImplBase;

import io.grpc.stub.StreamObserver;;

public class UserService extends userImplBase {

	@Override
	public void get(Empty request, StreamObserver<UserInfo> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("Get User");
		UserInfo.Builder response = UserInfo.newBuilder();
		response.setEmail("francisco@miflink.com");
		response.setLast("Urcino");
		response.setName("francisco");
		response.setPhone("7411196882");
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}
	
	
	
}