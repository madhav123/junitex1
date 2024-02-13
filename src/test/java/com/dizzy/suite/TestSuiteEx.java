package com.dizzy.suite;


import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@IncludeTags("taxes")
@SelectPackages("com.dizzy")
public class TestSuiteEx {
}
