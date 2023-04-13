using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace ChallengeZoomLink
{
    [TestClass]
    public class UnitTest1
    {
        
            private HomeTest driver = new HomeTest();
            private LoginZoomCare driver2 = new LoginZoomCare();
        private LogOutZoomCare driver3 = new LogOutZoomCare();
           
        
            [TestMethod]
            public void Test1()
            {
                driver.OpenPage();
                driver.Search();

                Assert.IsTrue(true);
            }

           [TestMethod]
            public void Test2()
            {
                driver2.OpenPage();
                driver2.LogintoZoomCare();
                Assert.IsTrue(true);
            }


            [TestMethod]
            public void Test3()
            {
                driver3.OpenPage();
                driver3.LogOutOfZoomCare();
                Assert.IsTrue(true,"Login");

            }
     }
}