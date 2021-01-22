package Udemy.learProgramming;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingIpRegex {

    public static boolean isValidIp(String ipAddress){

        Pattern pattern = Pattern.compile("^(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})$");
        Matcher matcher = pattern.matcher(ipAddress);
        return matcher.find();
    }



    }


