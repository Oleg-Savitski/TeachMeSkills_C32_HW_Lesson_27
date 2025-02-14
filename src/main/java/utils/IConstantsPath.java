package utils;

import java.util.regex.Pattern;

public interface IConstantsPath {
    String FILE_NAME = "C:\\Java-job\\TeachMeSkills_C32_HW_Lesson_27\\source\\users.txt";
    Pattern EMAIL_PATTERN = Pattern.compile("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$");
    String LOG_FILE_PATH_REQUEST = "C:\\Java-job\\TeachMeSkills_C32_HW_Lesson_27\\source\\logs\\request_log.txt";
    String LOG_FILE_PATH_SESSION = "C:\\Java-job\\TeachMeSkills_C32_HW_Lesson_27\\source\\logs\\session_log.txt";
    String LOG_FILE_PATH_APPLICATION = "C:\\Java-job\\TeachMeSkills_C32_HW_Lesson_27\\source\\logs\\application_log.txt";
}
