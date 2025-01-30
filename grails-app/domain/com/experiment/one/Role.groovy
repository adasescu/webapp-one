package com.experiment.one

class Role {

    String authority
    String description
    Boolean editable

    static belongsTo = [ user: User ]

    static constraints = {
        authority maxSize: 255
        description maxSize: 255
        editable nullable: false, defaultValue: false
    }
}