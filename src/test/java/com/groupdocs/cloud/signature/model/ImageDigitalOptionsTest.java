package com.groupdocs.cloud.signature.model;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.groupdocs.cloud.signature.client.JSON;
import java.util.Collections;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ImageDigitalOptionsTest {
  private final JSON json = new JSON();

  @Test
  public void signOptionsSerializeAsSignOptions() {
    SignImageDigitalOptions options = new SignImageDigitalOptions()
        .password("embed-password");
    SignSettings settings = new SignSettings()
        .options(Collections.<SignOptions>singletonList(options));

    JsonObject settingsJson = JsonParser.parseString(json.serialize(settings)).getAsJsonObject();
    JsonArray optionsJson = settingsJson.getAsJsonArray("options");
    assertEquals("embed-password", optionsJson.get(0).getAsJsonObject().get("password").getAsString());
    assertEquals(options, json.deserialize(json.serialize(options), SignImageDigitalOptions.class));
    assertTrue(options.toString().contains("password: embed-password"));
  }

  @Test
  public void verifyOptionsSerializeAsVerifyOptions() {
    VerifyImageDigitalOptions options = new VerifyImageDigitalOptions()
        .password("embed-password")
        .detectionThresholdPercent(75)
        .useFullDataExtraction(true);
    VerifySettings settings = new VerifySettings()
        .options(Collections.<VerifyOptions>singletonList(options));

    JsonObject settingsJson = JsonParser.parseString(json.serialize(settings)).getAsJsonObject();
    JsonObject optionsJson = settingsJson.getAsJsonArray("options").get(0).getAsJsonObject();
    assertEquals("embed-password", optionsJson.get("password").getAsString());
    assertEquals(75, optionsJson.get("detectionThresholdPercent").getAsInt());
    assertTrue(optionsJson.get("useFullDataExtraction").getAsBoolean());
    assertEquals(options, json.deserialize(json.serialize(options), VerifyImageDigitalOptions.class));
    assertTrue(options.toString().contains("detectionThresholdPercent: 75"));
  }

  @Test
  public void imageDigitalTypeAndForegroundAppearanceSerialize() {
    assertEquals(OptionsBase.SignatureTypeEnum.IMAGEDIGITAL,
        OptionsBase.SignatureTypeEnum.fromValue("ImageDigital"));
    assertEquals(DeleteOptions.SignatureTypeEnum.IMAGEDIGITAL,
        DeleteOptions.SignatureTypeEnum.fromValue("ImageDigital"));
    assertEquals(UpdateOptions.SignatureTypeEnum.IMAGEDIGITAL,
        UpdateOptions.SignatureTypeEnum.fromValue("ImageDigital"));
    assertEquals(Signature.SignatureTypeEnum.IMAGEDIGITAL,
        Signature.SignatureTypeEnum.fromValue("ImageDigital"));

    PdfDigitalSignatureAppearance appearance = new PdfDigitalSignatureAppearance()
        .isForegroundImage(true);
    JsonObject appearanceJson = JsonParser.parseString(json.serialize(appearance)).getAsJsonObject();
    assertTrue(appearanceJson.get("isForegroundImage").getAsBoolean());
    assertEquals(appearance, json.deserialize(json.serialize(appearance), PdfDigitalSignatureAppearance.class));
  }
}
