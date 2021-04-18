/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conTrol;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;

/**
 *
 * @author Nguyen Tien Dat
 */
public class uploadFile {

    public static String uploadFile(List fileItemList, String inputName, String filePathString) throws UnsupportedEncodingException, Exception {
        Iterator i = fileItemList.iterator();
        while (i.hasNext()) {
            FileItem fi = (FileItem) i.next();
            String fieldName = fi.getFieldName();
            if (fieldName.equalsIgnoreCase(inputName)) {
                if (fi.isFormField()) {
                    return fi.getString("UTF-8");
                } else {
                    String fileName = fi.getName();
                    if (fileName.equals("") == false) {
                        File file = new File(filePathString + fileName);
                        fi.write(file);
                    }
                    return fileName;
                }
            }
        }
        return "";
    }

}
