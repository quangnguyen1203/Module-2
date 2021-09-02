// JavaScript Document
function openSubMenu(id)
{
	var div_id = "icr-div-listProductMenu-" + id;
	var anchor_class = $('#' + div_id + ' .icr-div-listProductTitle a').attr('class');
	if (anchor_class == 'icr-anchor-listLink')
	{
		$('#' + div_id + ' .icr-div-listProductTitle a').attr('class', anchor_class + ' icr-anchor-listLinkActived');
		$('#' + div_id + ' .icr-div-listSubMenuProductOuter').animate({height: $('#' + div_id + ' .icr-div-listSubMenuProductInner').height() + "px"});
	} else {
		$('#' + div_id + ' .icr-div-listProductTitle a').attr('class', 'icr-anchor-listLink');
		$('#' + div_id + ' .icr-div-listSubMenuProductOuter').animate({height: "0px"});
	}
}