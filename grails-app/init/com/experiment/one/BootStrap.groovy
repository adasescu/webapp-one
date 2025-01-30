package com.experiment.one

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    def init = { servletContext ->
        def adminRole = new Role(authority: 'ROLE ADMIN', description: 'Administrator', editable: false).save(failOnError: true)
        def userRole = new Role(authority: 'ROLE USER', description: 'User', editable: false).save(failOnError: true)

        def adminUser = new User(name: 'admin', admin: true, loginCount: 1, role: adminRole).save(failOnError: true)
        def userUser = new User(name: 'user', admin: false, loginCount: 1, role: userRole).save(failOnError: true)
    }

    def destroy = {
    }
}