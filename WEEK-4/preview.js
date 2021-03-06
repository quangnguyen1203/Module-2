$(document).ready(	
	function() {
		var $panel = $(".panel");
		var $container = $panel.find(".container");
		var $infoSec = $panel.find(".info-section");
		
		$container.wtRotator({
			width:575,
			height:184,
			thumb_width:24,
			thumb_height:24,
			button_width:24,
			button_height:24,
			button_margin:5,
			auto_start:true,
			delay:6000,
			transition:"random",
			transition_speed:800,
			block_size:75,
			vert_size:55,
			horz_size:50,
			cpanel_align:"BR",
			timer_align:"top",
			display_thumbs:true,
			display_dbuttons:true,
			display_playbutton:true,
			display_thumbimg:false,			
			display_side_buttons:false,
			tooltip_type:"image",
			display_numbers:true,
			display_timer:true,
			mouseover_pause:false,
			cpanel_mouseover:false,
			text_mouseover:false,
			text_effect:"fade",
			text_sync:true,
			shuffle:true,
			block_delay:25,
			vstripe_delay:73,
			hstripe_delay:183
		});
		
		var $submitButton = $("#submit-btn");
		var $resetButton =  $("#reset-btn");
		var $trans = 		$("#transitions");
		var $easings =		$("#easing");
		var $textEffects = 	$("#texteffects");
		var $cpAlign = 		$("#cpalignments");
		var $cpPos = 		$("input[name='cp-pos']");
		var $cpanelCB = 	$("#cpanel-cb");
		var $ttType = 		$("#tt-type");
		var $thumbCB = 		$("#thumbs-cb");
		var $dBtnsCB = 		$("#dbuttons-cb");
		var $playBtnCB = 	$("#playbutton-cb");
		var $timerCB = 		$("#timer-cb");
		var $thumbImgCB =	$("#img-cb");
		var $sideBtnsCB =	$("#sidebtns-cb");		
		var $pauseCB = 		$("#pause-cb");
		var $textCB = 		$("#text-cb");
		
		$submitButton.click(function() {
			$container.undoChanges()
					  	.setTransition($trans.val())
						.setEasing($easings.val())
						.setTextEffect($textEffects.val())
						.setCpanelAlign($cpAlign.val())
						.setCpanelPos($cpPos.filter(":checked").val())
						.setTooltipType($ttType.val())
						.setThumbs($thumbCB.prop("checked"))
						.setDButtons($dBtnsCB.prop("checked"))
						.setPlayButton($playBtnCB.prop("checked"))
						.setTimerBar($timerCB.prop("checked"))
						.setThumbImg($thumbImgCB.prop("checked"))
						.setSideButtons($sideBtnsCB.prop("checked"))						
						.setMouseoverText($textCB.prop("checked"))
						.setMouseoverPause($pauseCB.prop("checked"))
						.setMouseoverCPanel($cpanelCB.prop("checked"))
						.updateChanges();
			
			var $rotatorDiv = $container.find(">div");
			$panel.width($rotatorDiv.outerWidth()).css("margin-left", -Math.round($panel.outerWidth()/2));
			$infoSec.width($rotatorDiv.width());
		});
		
		$resetButton.click(function() {
			init();
			$submitButton.trigger("click");
		});
		
		$trans.change(
			function() {		
				$easings.attr("disabled", $(this).val() == "none"); 
			}
		);
		
		$cpPos.change(
			function() {
				$cpanelCB.attr("disabled", $(this).filter(":checked").val() == "outside");
			}
		);
		
		$thumbCB.change(
			function() {
				$ttType.attr("disabled", !$(this).prop("checked")); 
				$thumbImgCB.attr("disabled", !$(this).prop("checked"));
				checkCPanel();	
			}
		);
		
		$dBtnsCB.change(
			function() { 
				if ($(this).prop("checked")) {
					$sideBtnsCB.prop("checked", "");
				}
				checkCPanel(); 
			}
		);
		
		$sideBtnsCB.change(
			function() { 
				if ($(this).prop("checked")) {
					$dBtnsCB.prop("checked", "");
				}
				checkCPanel();
			}
		);
		
		$playBtnCB.change(
			function() { 
				checkCPanel(); 
		});			
		
		var init = function() {
			$trans.val("random");
			$easings.val("").attr("disabled", false);
			$textEffects.val("fade");
			$cpAlign.val("BR").attr("disabled", false);
			$cpPos.attr("disabled", false);
			//$("input#pos-inside").prop("checked", true);
			$ttType.val("image").attr("disabled", false); 
			//$thumbCB.prop("checked", "checked");
			//$dBtnsCB.prop("checked", "checked");
			//$playBtnCB.prop("checked", "checked");
			//$timerCB.prop("checked", "checked");
			//$thumbImgCB.prop("checked", "").attr("disabled", false);
			//$sideBtnsCB.prop("checked", "");
			//$pauseCB.prop("checked", "");
			//$textCB.prop("checked", "");
			//$cpanelCB.prop("checked", "").attr("disabled", false);
		}
		
		var checkCPanel = function() {
			var val = ($thumbCB.prop("checked") || $dBtnsCB.prop("checked") || $playBtnCB.prop("checked"));
			$cpanelCB.attr("disabled", (!val || $cpPos.filter(":checked").val() == "outside") && !$sideBtnsCB.prop("checked"));
			$cpPos.attr("disabled", !val);
			$cpAlign.attr("disabled", !val);
		}	
		
		init();
	}
);