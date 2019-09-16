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
import org.openqa.selenium.Keys as Keys

//import ru.yandex.qatools.ashot.AShot
//import ru.yandex.qatools.ashot.Screenshot
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies
//import javax.imageio.ImageIO as ImageIO
WebUI.waitForPageLoad(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_New'))

WebUI.waitForPageLoad(1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_REFERENCE_REFERENCE'), strReference)

//WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DESPATCH DATE_despatch_d'), GlobalVariable.despatchDate)
WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_Add'), 1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/a_Add'))

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('MyFreight-Users/Page_Myfreight/modal_form'), 5)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/input_Customer Reference_code'), 5)

String ts = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Customer Reference_code'), 'Ref' + ts)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Customer Name_name'), 'Cust' + ts)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Email_email'), 'myhome@truhome.io')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Address Line 1_address_l'), '143 Happy Place')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Address Line 2_address_l'), 'Trafalgar North wing')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Address Line 3_address_l'), '6th Ring rd')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_Address Line 4_address_l'), '5th left turn')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_suburb town or city_loca'), '5022')

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_firstpostcodematch_dropdown'))

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/btn_modal_Save'))

WebUI.delay(1)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_QUANTITY'), Item1Quantity)

WebUI.selectOptionByIndex(findTestObject('MyFreight-Users/Page_Myfreight/select_ItemType'), '1')

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_LENGTH'), Item1Length)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_WIDTH'), Item1Width)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_HEIGHT'), Item1Height)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_cm_DEAD WEIGHT'), Item1DeadWeight)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_dangerous-goods-toggle ng-scope'))

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/input_DG_UN NUMBER'), 0)

WebUI.setText(findTestObject('MyFreight-Users/Page_Myfreight/input_DG_UN NUMBER'), Item1DG_UN)

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/div_dg-search-list'))

WebUI.delay(1)

WebUI.click(findTestObject('MyFreight-Users/Page_Myfreight/button_Save'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('MyFreight-Users/Page_Myfreight/a_CONSIGNMENTS'), 5)

//String ts = System.currentTimeMillis().toString()
//Screenshot screenshot = Ashot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver)
//ImageIO.write(screenshot.getImage(),"PNG",new File("C:\\Users\\dealdama\\Katalon Studio\\MyFreight - Consignments.prj\\Test\\test.png"))
WebUI.takeScreenshot(('Test/newreceiveraddress-wdg' + ts) + '.png')

