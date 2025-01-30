package com.experiment.one

class User {

    String name
    Boolean admin
    Integer loginCount
    Role role

    static constraints = {
        name maxSize: 255
        admin nullable: false, defaultValue: false
    }
}