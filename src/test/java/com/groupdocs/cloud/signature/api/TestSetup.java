package com.groupdocs.cloud.signature.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.groupdocs.cloud.signature.api.getinfo.TestSignatureGetFileInfo;
import com.groupdocs.cloud.signature.api.getinfo.TestSignatureGetFormats;
import com.groupdocs.cloud.signature.api.search.TestsSearchBarcode;
import com.groupdocs.cloud.signature.api.search.TestsSearchCollection;
import com.groupdocs.cloud.signature.api.search.TestsSearchDigital;
import com.groupdocs.cloud.signature.api.search.TestsSearchQRCode;
import com.groupdocs.cloud.signature.api.sign.TestsSignBarcode;
import com.groupdocs.cloud.signature.api.sign.TestsSignCollection;
import com.groupdocs.cloud.signature.api.sign.TestsSignDigital;
import com.groupdocs.cloud.signature.api.sign.TestsSignImage;
import com.groupdocs.cloud.signature.api.sign.TestsSignQRCode;
import com.groupdocs.cloud.signature.api.sign.TestsSignStamp;
import com.groupdocs.cloud.signature.api.sign.TestsSignText;
import com.groupdocs.cloud.signature.api.storage.*;
import com.groupdocs.cloud.signature.api.verify.TestsVerifyBarcode;
import com.groupdocs.cloud.signature.api.verify.TestsVerifyCollection;
import com.groupdocs.cloud.signature.api.verify.TestsVerifyDigital;
import com.groupdocs.cloud.signature.api.verify.TestsVerifyQRCode;
import com.groupdocs.cloud.signature.api.verify.TestsVerifyText;

@RunWith(Suite.class)
@SuiteClasses({
    TestStorageAuthentication.class,
    TestSignatureGetFileInfo.class,
    TestSignatureGetFormats.class,
    TestsSearchBarcode.class,
    TestsSearchCollection.class,
    TestsSearchDigital.class,
    TestsSearchQRCode.class,
    TestsSignBarcode.class,
    TestsSignCollection.class,
    TestsSignDigital.class,
    TestsSignImage.class,
    TestsSignQRCode.class,
    TestsSignStamp.class,
    TestsSignText.class,
    TestsVerifyBarcode.class,
    TestsVerifyCollection.class,
    TestsVerifyDigital.class,
    TestsVerifyQRCode.class,
    TestsVerifyText.class,
    TestStorageWorkWithFiles.class,
    TestStorageWorkWithFolders.class,
    TestStorage.class
})

public class TestSetup {
    

}
