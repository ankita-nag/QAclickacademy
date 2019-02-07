package interfaces;

import java.util.List;
import java.util.Set;

public interface Driver {
	public void openBrowser(String url) throws Exception;
	public void closeBrowser() throws Exception;
	public void closeAllBrowser() throws Exception;
	public void navigateBack() throws Exception;
	public void navigateForward() throws Exception;
	public void refresh() throws Exception;
	public String getPageTitle() throws Exception;
	public void getPageSource() throws Exception;
	public String getCurrentUrl() throws Exception;
	public String switchwindowsgeturl() throws Exception;
	public List<String> switchwindowsgettitle() throws Exception;
	public void frameno() throws Exception;

}
