package demo12;

import java.util.List;

public class UserService {

	private UserRepository repository = new UserRepository();
	
	/**
	 * 사용자 아이디를 전달받아서 해당 사용자정보를 반환한다.
	 * @param id 조회할 사용자 아이디
	 * @return 사용자정보 혹은 null
	 * 
	 */
	public User getUser(String id) {
		User user = null;
		
		user = repository.findUserById(id);
		
		return user;
	}
	
	/**
	 * 모든 사용자 정보를 반환한다.
	 * @return 전체 사용자 정보가 저장된 List객체
	 */
	public List<User> getAllUsers() {
		List<User> users = repository.findAll();
		return users;
	}
	
	/**
	 * 신규 사용자 정보를 전달받아서 등록 작업을 수행한다.
	 * 동일한 아이디를 가진 사용자가 없을 때만 등록시킨다.
	 * @param user 신규 사용자 정보
	 * @return 등록이 완료되면 true가 반환된다.
	 */
	public boolean addNewUser(User user) {
		boolean isSuccess = false;
		
		// 전달받은 사용자정보의 아이디로 저장된 사용자정보를 조회한다.
		String id = user.getId();
		User savedUser = repository.findUserById(id);
	
		// 사용자정보가 존재하지 않으면 콜렉션에 저장시킨다.
		if (savedUser == null) {
			repository.save(user);
			isSuccess = true;
		} 
		
		return isSuccess;
	}
}
