package src.constant;

public class UrlConstant {
    public UrlConstant() {}

    public static final String ADMIN_LOGIN = "api/v1/admin/login";
    public static final String ADMIN_DELETE = "api/v1/admin/{user_id}";
    public static final String ADMIN_SEARCH = "api/v1/admin/search";

    public static final String TEACHER_UPDATE = "api/v1/teacher/update/{teacher_id}";
    public static final String TEACHER_DELETE = "api/v1/teacher/{teacher_id}";
    public static final String TEACHER_SEARCH = "api/v1/teacher/search";

    public static final String COURSE_ADD = "api/v1/course/add";
    public static final String COURSE_UPDATE = "api/v1/course/update/{course_id}";
    public static final String COURSE_DELETE = "api/v1/course/{course_id}";
    public static final String COURSE_SEARCH = "api/v1/course/search";

    public static final String CHAPTER_ADD = "api/v1/chapter/add";
    public static final String CHAPTER_UPDATE = "api/v1/chapter/update/{chapter_id}";
    public static final String CHAPTER_DELETE = "api/v1/chapter/{chapter_id}";
    public static final String CHAPTER_SEARCH = "api/v1/chapter/search";

    public static final String LESSON_ADD = "api/v1/lesson/add";
    public static final String LESSON_UPDATE = "api/v1/lesson/update/{lesson_id}";
    public static final String LESSON_DELETE = "api/v1/lesson/delete/{lesson_id}";
    public static final String LESSON_SEARCH = "api/v1/lesson/search";

    public static final String USER_SIGNUP = "api/v1/user/signup";
    public static final String USER_LOGIN = "api/v1/user/login";
    public static final String USER_UPDATE = "api/v1/user/{user_id}";
    public static final String USER_DELETE = "api/v1/user/{user_id}";
    public static final String USER_SIGNUP_COURSE = "api/v1/user/course/signup";
    public static final String USER_RATING_COURSE = "api/v1/user/course/rating";
    public static final String USER_REVIEW_COURSE = "api/v1/user/course/comment";
}