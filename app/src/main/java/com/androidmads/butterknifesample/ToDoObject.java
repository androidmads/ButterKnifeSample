package com.androidmads.butterknifesample;

class ToDoObject {
    private String todoType;
    private String todoName;

    ToDoObject(String todoType, String todoName) {
        this.todoType = todoType;
        this.todoName = todoName;
    }

    String getTodoType() {
        return todoType;
    }

    String getTodoName() {
        return todoName;
    }

}
