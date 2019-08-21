public actionClass{

public stattic void main(String args[]){






Actions action= new Actions(driver);
action.moveToElement(driver.findElement(By.id("sumit"))).build().perform();
action.clickAndHold(driver.findElement(By.xpath("//*[@id='test']"))).moveToElement(driver.findElement(By.id("sumit"))).release().build().perform();


}
}
