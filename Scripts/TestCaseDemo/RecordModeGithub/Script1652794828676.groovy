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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://github.com/')

WebUI.click(findTestObject('Object Repository/RecordModeGithub/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/RecordModeGithub/input_Username or email address_login'), 
    'rizkyadindaazizah@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/RecordModeGithub/input_Password_password'), '6YaGp2Fu22W9nc8DJEbIgg==')

WebUI.click(findTestObject('Object Repository/RecordModeGithub/input_Password_commit'))

WebUI.click(findTestObject('Object Repository/RecordModeGithub/img_New project_avatar avatar-small circle'))

WebUI.click(findTestObject('Object Repository/RecordModeGithub/summary_New project_Header-link'))

WebUI.click(findTestObject('Object Repository/RecordModeGithub/span_New project_dropdown-caret'))

WebUI.click(findTestObject('Object Repository/RecordModeGithub/a_Your profile'))

WebUI.click(findTestObject('Object Repository/RecordModeGithub/summary_New project_Header-link (1)'))

WebUI.click(findTestObject('Object Repository/RecordModeGithub/button_Sign out'))

WebUI.closeBrowser()

