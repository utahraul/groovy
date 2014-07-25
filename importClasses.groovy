import java.text.*
//assert new DecimalFormal( '#,#00.0' ).format( 5.6789 ) == '05,68'
assert new java.text.DecimalFormat( '#,#00.0#' ).format( 5.6789 ) == '05,68'