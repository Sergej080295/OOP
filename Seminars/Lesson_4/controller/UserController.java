package Seminars.Lesson_4.controller;

import Seminars.Lesson_4.model.User;

public interface UserController {
    <T extends User> User create(T user);


}