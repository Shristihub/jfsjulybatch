package com.testcases;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@SelectClasses(value = {NewStudentTest.class})

//@SelectPackages({"com.testcases.demo","com.testcases.example"})
@SelectPackages({"com.testcases"})
@IncludeTags({"prod","sum"})
//@IncludePackages({"com.testcases.demo.stud"}) // only this will be tested

//@ExcludePackages({"com.testcases.demo.stud"}) // only this will be ignored
public class AllTests {

}
