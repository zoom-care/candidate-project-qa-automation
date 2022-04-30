using System.Collections.Generic;

namespace SchedulerUIAutomationTests.Utilities
{
    internal class UIConstants
    {
        public static List<string> expectedCareSelector = new() { 
            "Illness/Injury", 
            "Adult COVID-19 Screening",
            "Pediatric COVID-19 Screening",
            "Primary Care",
            "Family Medicine",
            "Emergency Care",
            "Sports Physical",
            "Mental Health Meds & More",
            "Mental Health Talk Therapy",
            "X-Ray & Imaging",
            "Dermatology",
            "Women's Health (Gynecology)",
            "Orthopedics",
            "Podiatry",
            "Chiropractic",
            "Physical Therapy",            
        };
        public static string PrimaryCare = "Primary Care";
        public static string ChatCare = "ChatCare™";
        public static string VideoCare = "VideoCare™";
        public static string ClinicCare = "Clinic Care";
        public static string IllnessInjury = "Illness/Injury";
        public static string IllnessInjury_ServiceLine = "Illness/Injury Clinic Visit";
        public static string VideoCare_ServiceLine = "Illness/Injury Video Visit";
        public static string NotInArea = "We're not in your area yet—but we're growing almost as fast as we deliver care! Follow us on social to stay up-to-date on ZoomCare news, announcements and more. Want to see clinics outside of your region? Click below.";
        public static string AreYouSure = "Are you sure?";
        public static string No = "No";
        public static string CancelVisit = "Cancel Visit";
        public static string SelectedDayNotAvailable = "The selected day is not available.";
        public static string WantCare = "Want care in";
        public static string WantCare97124 = "Want care in 97124";
        public static string ClinicCloseToYou = "Want to find the clinic closest to you?";
        public static string UseMyLocation = "Use my location";
    }
}
