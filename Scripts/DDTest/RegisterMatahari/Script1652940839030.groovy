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

WebUI.navigateToUrl('https://www.matahari.com/customer/account/login/')

WebUI.click(findTestObject('Object Repository/Matahari/Page_Login Pelanggan  Matahari.com/a_Bikin akun'))

WebUI.setText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_Email_email'), 
    email)

WebUI.setText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_Nama Anda_firstname'), 
    nama)

WebUI.setText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_No. Handphone_phone_number'), 
    nohp)

WebUI.setText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_Tanggal Lahir_dobdate'), 
    tgl_lahir)

WebUI.click(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/button_Done'))

WebUI.setEncryptedText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_Password (minimal 8 karakter)_password'), 
    password)

WebUI.click(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/label_Pria'))

WebUI.click(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_Masukan kode OTP yang Anda terima di _d0a841'), 
    otp1)

WebUI.setText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_Masukan kode OTP yang Anda terima di _e3d219'), 
    otp2)

WebUI.setText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_Masukan kode OTP yang Anda terima di _3172c7'), 
    otp3)

WebUI.setText(findTestObject('Object Repository/Matahari/Page_Buat Akun Pelanggan Baru  Matahari.com/input_Masukan kode OTP yang Anda terima di _12c735'), 
    otp4)

WebUI.closeBrowser()

