package com.epam.lab.utils;

import com.epam.lab.models.UserModel;
import com.epam.lab.utils.csv.CSVReader;
import com.epam.lab.utils.xlsx.XLSXReader;
import com.epam.lab.utils.xml.users.UserDataUnmarshaller;

import java.util.List;

public class DataReader {
    public Object[][] getXMLData() {
        List<UserModel> userModels = new UserDataUnmarshaller().createObjectsUserData();
        Object[][] gmailData = new Object[userModels.size()][1];
        for (int i = 0, j = 0; i < userModels.size(); i++, j++) {
            gmailData[i][0] = userModels.get(i);
        }
        return gmailData;
    }

    public Object[][] getXLSAndCSVData() {
        List<UserModel> userModels = new XLSXReader().getUsers();
        Object[][] gmailData = new Object[userModels.size()][1];
        for (int i = 0, j = 0; i < userModels.size(); i++, j++) {
            gmailData[i][0] = userModels.get(i);
        }
        return gmailData;
    }
}
