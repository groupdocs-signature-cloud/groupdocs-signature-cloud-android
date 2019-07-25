package com.groupdocs.cloud.signature.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.groupdocs.cloud.signature.api.storage.*;

@RunWith(Suite.class)
@SuiteClasses({
    TestStorageAuthentication.class,
    TestStorageWorkWithFiles.class,
    TestStorageWorkWithFolders.class
    //ViewerCreateViewApiTests.class,
    //ViewerDeleteViewApiTests.class,
    //StorageApiTests.class,
    //FolderApiTests.class,
    //FileApiTests.class
})

public class TestSetup {
    

}
