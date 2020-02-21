import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.awt.List as List
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

WebUI.callTestCase(findTestCase('MyFreight - login'), [('loginEmail') : 'davide.myfreight@gmail.com', ('loginPwd') : 'EFc/3RtcwuGANqtaSV3M6Q=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/a_QUOTES'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_btn btn-inverse dropdown-toggle'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/Quotes/a_New Quote'))

WebUI.delay(1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_REFERENCE_REFERENCE'), strReference)

//WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DESPATCH DATE_despatch_d'), GlobalVariable.despatchDate)
WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_RECEIVER DETAILS_Receive'), strAddrSearchTerm)

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_Address_dropdown_item1'))

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_QUANTITY'), Item1Quantity)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), 1)

WebUI.selectOptionByLabel(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), Item1ItemType, false)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_LENGTH'), Item1Length)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_WIDTH'), Item1Width)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_HEIGHT'), Item1Height)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_DEAD WEIGHT'), Item1DeadWeight)

'Toggle the Hazardous flag for the first item'
WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_dangerous-goods-toggle ng-scope'))

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/input_DG_UN NUMBER'), 1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DG_UN NUMBER'), Item1DG_UN)

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_dg-search-list'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_Add item line'))

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_QUANTITY_2'), '2')

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/select_ITEM_TYPE_2'), 1)

WebUI.selectOptionByLabel(findTestObject('MyFreight-Users/Page_Myfreight/select_ITEM_TYPE_2'), 'Satchel 3kg', false)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_LENGTH_2'), '55')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_WIDTH_2'), '33')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_HEIGHT_2'), '55')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DEAD WEIGHT_2'), '45')

'toggle hazardous flag for item 2'
WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_dangerous-goods-toggle ng-scope_2'))

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/input_DG_UN NUMBER_2'), 0)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DG_UN NUMBER_2'), '123')

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_dg-search-list'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_Save'))

WebUI.delay(1)

String ts = System.currentTimeMillis().toString()

WebUI.takeScreenshot(('Test/Quotes-existingrcvraddr-' + ts) + '.png')

WebUI.closeBrowser()

