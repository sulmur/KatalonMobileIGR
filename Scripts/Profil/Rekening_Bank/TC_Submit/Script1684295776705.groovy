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

'Tap tombol \'Simpan\''
Mobile.tap(findTestObject('Profil/Rekening_Bank/Submit/Tombol Simpan'), 0)

if (Mobile.waitForElementPresent(findTestObject('Profil/Rekening_Bank/Submit/Setuju Simpan Rekening'), 0)) {
    'Tap tombol \'Lanjutkan\' pada pop-up konfirmasi rekening bank'
    Mobile.tap(findTestObject('Profil/Rekening_Bank/Submit/Setuju Simpan Rekening'), 0)

    Mobile.waitForElementPresent(findTestObject('Object Repository/Profil/Rekening_Bank/Submit/android.widget.Button (2)'), 
        0)

    'Tap tombol \'Tutup\''
    Mobile.tap(findTestObject('Object Repository/Profil/Rekening_Bank/Submit/android.widget.Button (2)'), 0)

    Mobile.takeScreenshot('Reports/Sukses Simpan Bank.png')
} else {
    Mobile.waitForElementPresent(findTestObject('Profil/Rekening_Bank/Submit/Setuju Simpan Rekening gagal'), 0)

    'Tap tombol \'Lanjutkan\' pada pop-up konfirmasi rekening bank'
    Mobile.tap(findTestObject('Profil/Rekening_Bank/Submit/Setuju Simpan Rekening gagal'), 0)

    Mobile.waitForElementPresent(findTestObject('Profil/Rekening_Bank/Submit/Submit Rekening Bank Gagal'), 0)

    Mobile.takeScreenshot('Reports/Gagal Simpan Rekening.png')

    'Tap tombol \'OK\' pada konfirmasi gagal simpan nomor rekening'
    Mobile.tap(findTestObject('Profil/Rekening_Bank/Submit/Submit Rekening Bank Gagal'), 0)
}

Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

