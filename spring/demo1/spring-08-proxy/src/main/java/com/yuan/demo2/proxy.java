package com.yuan.demo2;

public class proxy implements UserService{
    private UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.add();
    }

    @Override
    public void delete() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.delete();
    }

    @Override
    public void update() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.update();
    }

    @Override
    public void query() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.query();

    }
}
