$CAPTCHA = read-host "De input om te solven"
$CAPTCH_ARRAY = $CAPTCHA.ToCharArray()
$SUM = 0
for($i=0;$i -lt $CAPTCH_ARRAY.length -1; $i++){
	if($CAPTCH_ARRAY[$i] -eq $CAPTCH_ARRAY[$i+1]){
		$SUM += ([convert]::ToInt32($CAPTCH_ARRAY[$i], 10))
	}
}
write-host "before end" $SUM
if($CAPTCH_ARRAY[$i] -eq $CAPTCH_ARRAY[0]){
		$SUM += ([convert]::ToInt32($CAPTCH_ARRAY[$i], 10))
}
write-host "DE SUM IS $SUM"

$CAPTCHA = read-host "De input om te solven 2"
$CAPTCH_ARRAY = $CAPTCHA.ToCharArray()
$SUM = 0
$OFFSETT =$CAPTCH_ARRAY.length/2
for($i=0;$i -lt $CAPTCH_ARRAY.length; $i++){
	if($CAPTCH_ARRAY[$i] -eq $CAPTCH_ARRAY[($i+$OFFSETT)%$CAPTCH_ARRAY.length]){
		$SUM += ([convert]::ToInt32($CAPTCH_ARRAY[$i], 10))
	}
}
write-host "DE SUM IS $SUM"
read-host