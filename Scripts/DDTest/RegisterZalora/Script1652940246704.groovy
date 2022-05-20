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

WebUI.navigateToUrl('https://www.zalora.co.id/customer/account/create/')

WebUI.setText(findTestObject('Object Repository/Zalora/Page_Buat account pembeli baru/input__RegistrationFormemail'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Zalora/Page_Buat account pembeli baru/input_Sembunyikan_RegistrationFormpassword'), 
    password)

WebUI.click(findTestObject('Object Repository/Zalora/Page_Buat account pembeli baru/span_Pria_radiomark'))

WebUI.setText(findTestObject('Object Repository/Zalora/Page_Buat account pembeli baru/input_Nama Depan_RegistrationFormfirst_name'), 
    namadepan)

WebUI.selectOptionByValue(findTestObject('Object Repository/Zalora/Page_Buat account pembeli baru/select_010203040506070809101112131415161718_970652'), 
    tanggal, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Zalora/Page_Buat account pembeli baru/select_JanuariFebruariMaretAprilMeiJuniJuli_13de9b'), 
    bulan, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Zalora/Page_Buat account pembeli baru/select_202220212020201920182017201620152014_d959b4'), 
    tahun, true)

WebUI.click(findTestObject('Object Repository/Zalora/Page_Buat account pembeli baru/button_Konfirmasi dan Lanjutkan'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Zalora/Page_Verifikasi Akun/input_Ubah_email-otp-input'), kodeotp)

