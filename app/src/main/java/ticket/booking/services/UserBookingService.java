package ticket.booking.services;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.type.TypeReference;

public class UserBookingService {

  private User user;

  private List<User> userList;

  private static final OBJECT_MAPPER=new ObjectMapper();

  private static final String USERS_PATH = "../localDb/users.json"

  public UserBookingService(User user1) throws IOException {
    this.user = user1;
    File users = new File(USERS_PATH);
    userList = ObjectMapper.readValue(users, new TypeReference<List<User>>() {})
  }


}
