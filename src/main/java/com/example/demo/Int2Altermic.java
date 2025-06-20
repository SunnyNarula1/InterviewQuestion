package com.example.demo;

public class Int2Altermic {
	
	    public static void main(String[] args) {
	        int hour = 9;
	        int minute = 28;

	        double minuteAngle = minute * 6; // 360 degrees / 60 minutes
	        double hourAngle = (hour % 12) * 30 + (minute * 0.5); // 360 degrees / 12 hours + half degree per minute

	        double angle = Math.abs(hourAngle - minuteAngle);
	        angle = Math.min(angle, 360 - angle); // Always take the smaller angle

	        System.out.println("Angle between hour and minute hand at " + hour + ":" + minute + " is: " + angle + " degrees");
	    }
	}

/*
9:28 angle between hour and minutes


360 angle = 12 hour  = 30 deg /hour 
360 angle = 60 min = 6 deg/min

6*28  = 168 

@Data
class RequestDto {

@NotNull
private String hour ;
@NotNull
private String min ; 

//getter and setter

}

Thank you for your email.

Please find below the alternate contact details for the organization you mentioned:

Name of the Organization: GLADWIN TECHGEN PRIVATE LIMITED
Alternate Contact Person: [Name – if known or leave blank if not available]
Contact Number: [Alternate Phone Number – if available]
Email ID: [Alternate Email ID – if available]

Kindly let me know if you need any further assistance.

Best regards,
Sunny



@RestController
@Requestmapping("/clock")
class ClockController {


@Autowired
private ClockService clockService ;


@GetMapping("/angle")
public BaseDto calculateAngle(@RequestParam String hour , @RequestParam String min){
return clockService.calcucateAngle(hour,min);
}

@PostMapping("/angle")
public BaseDto calculateAngle(@RequestBody @Valid RequestDto dto){
return clockService.calcucateAngle(dto);
}






interface ClockService {
BaseDto calcucateAngle (String hour , String min);
BaseDto calcucateAngle(RequestDto dto);

}





@Service
class ClockServiceIml implements ClockService {


@OVerride
public BaseDto calcucateAngle (String hour , String min){
BaseDto baseDto = new BaseDto();
 Double angle ; 
 if(min<60){
  angle = min*6 ; 
 }

baseDto.setResponse(angle) ;

return baseDto ;

}


@OVerride
public BaseDto calcucateAngle (RequestDto dto){
BaseDto baseDto = new BaseDto();
 Double angle ; 
 if(dto.getmin()<60){
  angle = min*6 ; 
 }

baseDto.setResponse(angle) ;

return baseDto ;
} */