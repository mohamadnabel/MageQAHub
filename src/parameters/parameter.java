package parameters;

import java.util.Random;

public class parameter {

	Random rand = new Random();

	protected String URL = "https://magento.softwaretestingboard.com";

	protected String[] randoomFirstName = { "mohammad", "ahmad", "yousef", "Esaa", "rama" };

	protected String[] randoomLastName = { "mahmoud", "yazan", "basell", "kallel", "omran" };

	protected int randomNumber = rand.nextInt(99);

	protected int randFName = rand.nextInt(randoomFirstName.length);

	protected int randLName = rand.nextInt(randoomLastName.length);

}
