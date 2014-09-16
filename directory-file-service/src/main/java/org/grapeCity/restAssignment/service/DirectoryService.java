/**
 * 
 */
package org.grapeCity.restAssignment.service;

import org.grapeCity.restAssignment.domain.Directory;
import org.grapeCity.restAssignment.domain.Files;

/**
 * This interface facilitates providing file or directory related services for the requested web service 
 * 1.	Provide files/directories within a given directory (and optionally its subdirectories) which match the directory path.
 * 2.	Provide files and its attributes within a given file which match the file path.
 * 
 * @author Gaurav Asthana
 * @version 1.0 Date - 18 Jan 2014
 */
public interface DirectoryService {

	/**
	 * Provide files and its attributes within a given file which match the file path.
	 * @param filePath
	 * @return
	 */
	Files getFileDetails(String filePath);

	//Files delete(long userId);

	/**
	 *  Provide files/directories within a given directory (and optionally its subdirectories) which match the directory path.
	 * @param dirPath
	 * @return
	 */
	Directory getDirectoryList(String dirPath);
}
