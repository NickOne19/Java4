package org.example;

import java.util.HashMap;

/**
 * The type Department.
 */
public class Department {
    private static int nextId = 1;
    private final int id;
    private final String name;

    private static HashMap<String, Department> departmentCache = new HashMap<>();

    /**
     * Instantiates a new Department.
     *
     * @param id   the id
     * @param name the name
     */
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets department.
     *
     * @param name the name
     * @return the department
     */
    public static Department getDepartment(String name) {
        if (departmentCache.containsKey(name)) {
            return departmentCache.get(name);
        }
        else {
            Department department = new Department(nextId++, name);
            departmentCache.put(name, department);
            return department;
        }
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
}
