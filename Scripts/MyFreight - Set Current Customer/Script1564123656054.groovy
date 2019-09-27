import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(2)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/img_1'))

WebUI.verifyElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/select_ng-valid ng-not-empty n (1)'))

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('MyFreight-Users/Page_Myfreight/select_ng-valid ng-not-empty n (1)'), 'Myfreight (TEST)', 
    false)

WebUI.selectOptionByLabel(findTestObject('MyFreight-Users/Page_Myfreight/select_ng-valid ng-not-empty n (1)'), 'Birkenstock Australia (LIVE)', 
    false)

WebUI.click(findTestObject('Object Repository/MyFreight-Users/Page_Myfreight/button_Switch'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'))

