package week5day2_TestNG_1AnnotationsAttributes;

import org.testng.annotations.Test;

public class TestNGAttribute_14_Description {

	@Test(description = "Launches the WordPress site")
	public void launchSite() {
		System.out.println("launchSite");
	}

	@Test(description = "Navigates to the admin page")
	public void openAdminPage() {
		System.out.println("openAdminPage");
	}

	@Test(description = "Enters valid login data")
	public void loginAsAdmin() {
		System.out.println("loginAsAdmin");
	}

	@Test(description = "Navigates to the New Post screen")
	public void navigateNewPost() {
		System.out.println("navigateNewPost");
	}

	@Test(description = "Writes the new post")
	public void writeBlogPost() {
		System.out.println("writeBlogPost");
	}

	@Test(description = "Publishes the post")
	public void publishBlogPost() {
		System.out.println("publishBlogPost");
	}

	@Test(description = "Verifies the post")
	public void verifyBlogPost() {
		System.out.println("Verifies the post");
	}

	@Test(description = "Logs out")
	public void logout() {
		System.out.println("Logs out");
	}

}
