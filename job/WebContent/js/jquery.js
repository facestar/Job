jQuery(function($){
	$('#demo1').slideBox();
	$('#demo2').slideBox({
		direction : 'top',//left,top#����
		duration : 0.3,//��������ʱ�䣬��λ����
		easing : 'linear',//swing,linear//������Ч
		delay : 10,//�����ӳ�ʱ�䣬��λ����
		startIndex : 1//��ʼ����˳��
	});
	$('#demo3').slideBox({
		duration : 0.3,//��������ʱ�䣬��λ����
		easing : 'linear',//swing,linear//������Ч
		delay : 5,//�����ӳ�ʱ�䣬��λ����
		hideClickBar : false,//���Զ����ص�ѡ����
		clickBarRadius : 10
	});
	$('#demo4').slideBox({
		hideBottomBar : true//���ص���
	});
});