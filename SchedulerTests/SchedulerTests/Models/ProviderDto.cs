using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SchedulerUIAutomationTests.Models
{
    public class ProviderDto
    {
        public string ClinicLocationRow { get; set; }
        public string ClinicLink { get; set; } 
        public string AddressLine1 { get; set; }
        public string AddressLine2 { get; set; }
        public string MapLink { get; set; } 
        public string DistanceToClinic { get; set; } 
        public string ViewClinicServices { get; set; } 
        public string ProviderAvatar { get; set; } 
        public string ProviderName { get; set; } 
        public string ProviderService { get; set; } 
        public string TodayLabel { get; set; } 
        public string TodayDate { get; set; } 
        public string TimeZone { get; set; } 
    }
}
