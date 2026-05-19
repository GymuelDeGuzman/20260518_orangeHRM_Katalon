import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

if (WebUI.waitForElementNotPresent(findTestObject('Object Repository/dashboard/div_searchResult_sampleUser01'), 0, FailureHandling.STOP_ON_FAILURE)) {
    WebUI.callTestCase(findTestCase('NewUser_ValidInput_RedirectToAdd_ReturnToDashboard'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Dashboard_SearchUsername_ReturnResult'), [:], FailureHandling.STOP_ON_FAILURE)
}

WebUI.click(findTestObject('Object Repository/dashboard/btn_editUser'))

WebUI.waitForElementPresent(findTestObject('Object Repository/editUserPage/lbl_editUser'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('editUserPage/lbl_editUser'), 0)

WebUI.click(findTestObject('Object Repository/editUserPage/txt_username'))
WebUI.sendKeys(findTestObject('Object Repository/editUserPage/txt_username'), Keys.chord(Keys.CONTROL, 'a') + Keys.BACK_SPACE)

WebUI.setText(findTestObject('Object Repository/editUserPage/txt_username'), 'sampleUser02')

WebUI.click(findTestObject('Object Repository/editUserPage/btn_Save'))

WebUI.waitForElementPresent(findTestObject('Object Repository/addUserPage/div_SuccessSuccessfully Saved'), 0, FailureHandling.STOP_ON_FAILURE)

