package week6day1_2DataProviderExample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MoreExamples {

	@DataProvider(name = "provideDaysInterval")
	public Object[][] provideData() {
		return new Object[][] { { 1 }, { 2 }, { 28 }, { 110 }, { 365 }, { 400 }, { 800 } };
	}

	@DataProvider(name = "invalidIds")
	public Object[][] provideInvalidIds() {
		return new Object[][] { { "a" }, { "asdasdasf" }, { "£!@$%^&amp;*^(&amp;*&amp;^%£$@£!" }, { "1" },
				{ "2332423" }, { "123456786543sadfgh" }, { "1234567890" } };
	}

	@DataProvider(name = "minMaxDates")
	public Object[][] provideMinMaxDateRanges() {
		return new Object[][] { { "2013-01-04", "2014-01-04", "2014-04-04", "2015-07-04" },
				{ "2013-01-04", "2013-04-04", "2014-04-04", "2014-07-04" } };
	}

	@Test(groups = { "smoke" }, dataProvider = "provideDaysInterval")
	public void test_Days_Are_Valid(int numberOfDaysInterval) {
		System.out.println("provideDaysInterval");

	}

	@Test(groups = { "smoke" }, dataProvider = "minMaxDates")
	public void test_Data_Ranges_Validate_Min_Max(String startDateFirst, String endDateFirst, String startDateLast,
			String endDateLast) {
		System.out.println("minMaxDates");

	}
}
