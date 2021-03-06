package myapps.solutions.wrapper.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import myapps.solutions.wrapper.model.TermsConditions;
import myapps.solutions.wrapper.model.ViewTerms;

public interface ITermsConditionsDAO {

	boolean insertTermsAndConditionsDetails(String sessionId, MultipartFile fileName, int userType, int productId, Date startDate, String title) throws IOException, FileNotFoundException;
	boolean updateTermsAndConditions(int id, String sessionId);
	boolean updateTermsAndConditionsHistory(int terms_conditions_id, String sessionId);
	TermsConditions getTermsAndConditions(String userType, String product);
	List<ViewTerms> getTCPS(String sessionId, String product);
	TermsConditions viewTCPS(String sessionId, int id);
}
